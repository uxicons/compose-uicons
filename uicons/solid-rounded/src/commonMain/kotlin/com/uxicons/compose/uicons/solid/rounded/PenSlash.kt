package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenSlash: ImageVector? = null

val Icons.Sr.PenSlash: ImageVector
    get() = _PenSlash ?: UXIcon(name = "PenSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 22.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineTo(0.29f, 1.71f)
                curveTo(-0.1f, 1.32f, -0.1f, 0.68f, 0.29f, 0.29f)
                reflectiveCurveTo(1.32f, -0.1f, 1.71f, 0.29f)
                lineToRelative(9.14f, 9.14f)
                lineToRelative(3.75f, -3.75f)
                lineToRelative(3.71f, 3.71f)
                lineToRelative(-3.75f, 3.75f)
                lineToRelative(9.14f, 9.14f)
                close()
                moveTo(23.23f, 4.48f)
                curveToRelative(1.02f, -1.02f, 1.02f, -2.69f, 0f, -3.71f)
                curveToRelative(-1.02f, -1.02f, -2.69f, -1.02f, -3.71f, 0f)
                lineToRelative(-3.51f, 3.51f)
                lineToRelative(3.71f, 3.71f)
                lineToRelative(3.51f, -3.51f)
                close()
                moveTo(1.17f, 19.12f)
                curveToRelative(-0.75f, 0.75f, -1.17f, 1.77f, -1.17f, 2.83f)
                verticalLineToRelative(2.05f)
                horizontalLineToRelative(2.05f)
                curveToRelative(1.06f, 0f, 2.08f, -0.42f, 2.83f, -1.17f)
                lineToRelative(6.84f, -6.84f)
                lineToRelative(-3.71f, -3.71f)
                lineToRelative(-6.84f, 6.84f)
                close()
            }
        }.also { _PenSlash = it}
