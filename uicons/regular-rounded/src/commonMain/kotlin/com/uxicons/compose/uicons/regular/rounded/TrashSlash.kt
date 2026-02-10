package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashSlash: ImageVector? = null

val Icons.Rr.TrashSlash: ImageVector
    get() = _TrashSlash ?: UXIcon(name = "TrashSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 22.29f)
                lineToRelative(-3.78f, -3.78f)
                lineToRelative(1.19f, -12.52f)
                horizontalLineToRelative(0.89f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4.1f)
                curveToRelative(-0.47f, -2.28f, -2.48f, -4f, -4.9f, -4f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.41f, 0f, -4.43f, 1.72f, -4.9f, 4f)
                curveToRelative(0f, 0f, -0.66f, 0.0f, -0.68f, 0.0f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineToRelative(22f, 22f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(18.09f, 16.68f)
                lineTo(7.41f, 6f)
                horizontalLineToRelative(11.69f)
                lineToRelative(-1.01f, 10.68f)
                close()
                moveTo(11f, 2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.3f, 0f, 2.42f, 0.84f, 2.83f, 2f)
                horizontalLineToRelative(-7.66f)
                curveToRelative(0.41f, -1.16f, 1.52f, -2f, 2.83f, -2f)
                close()
                moveTo(17.84f, 21.84f)
                curveToRelative(0.29f, 0.47f, 0.16f, 1.08f, -0.31f, 1.38f)
                curveToRelative(-0.8f, 0.51f, -1.73f, 0.78f, -2.67f, 0.78f)
                horizontalLineToRelative(-5.73f)
                curveToRelative(-2.59f, 0f, -4.73f, -1.94f, -4.98f, -4.52f)
                lineToRelative(-0.9f, -9.38f)
                curveToRelative(-0.05f, -0.55f, 0.35f, -1.04f, 0.9f, -1.09f)
                curveToRelative(0.56f, -0.07f, 1.04f, 0.35f, 1.09f, 0.9f)
                lineToRelative(0.9f, 9.38f)
                curveToRelative(0.15f, 1.55f, 1.43f, 2.71f, 2.99f, 2.71f)
                horizontalLineToRelative(5.73f)
                curveToRelative(0.57f, 0f, 1.12f, -0.16f, 1.6f, -0.47f)
                curveToRelative(0.47f, -0.3f, 1.08f, -0.16f, 1.38f, 0.31f)
                close()
            }
        }.also { _TrashSlash = it}
