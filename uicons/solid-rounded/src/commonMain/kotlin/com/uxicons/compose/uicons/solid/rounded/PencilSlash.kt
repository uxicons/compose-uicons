package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PencilSlash: ImageVector? = null

val Icons.Sr.PencilSlash: ImageVector
    get() = _PencilSlash ?: UXIcon(name = "PencilSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.73f, 7.99f)
                lineToRelative(-3.71f, -3.71f)
                lineToRelative(3.51f, -3.51f)
                curveToRelative(1.02f, -1.02f, 2.69f, -1.02f, 3.71f, 0f)
                curveToRelative(1.02f, 1.02f, 1.02f, 2.69f, 0f, 3.71f)
                lineToRelative(-3.51f, 3.51f)
                close()
                moveTo(1.06f, 19.25f)
                curveToRelative(-0.68f, 0.74f, -1.06f, 1.69f, -1.06f, 2.7f)
                verticalLineToRelative(2.05f)
                horizontalLineToRelative(2.05f)
                curveToRelative(1.0f, 0f, 1.96f, -0.39f, 2.7f, -1.06f)
                lineToRelative(-3.69f, -3.69f)
                close()
                moveTo(2.47f, 17.82f)
                lineToRelative(3.71f, 3.71f)
                lineToRelative(5.55f, -5.55f)
                lineToRelative(-3.71f, -3.71f)
                lineToRelative(-5.55f, 5.55f)
                close()
                moveTo(14.56f, 13.15f)
                lineToRelative(3.75f, -3.75f)
                lineToRelative(-3.71f, -3.71f)
                lineToRelative(-3.75f, 3.75f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineToRelative(22f, 22f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-9.14f, -9.14f)
                close()
            }
        }.also { _PencilSlash = it}
