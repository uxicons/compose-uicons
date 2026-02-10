package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Camcorder: ImageVector? = null

val Icons.Rr.Camcorder: ImageVector
    get() = _Camcorder ?: UXIcon(name = "Camcorder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 10f)
                lineTo(5f, 10f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                lineTo(14f, 20f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(15f, 11f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(13f, 18f)
                lineTo(6f, 18f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(6f)
                close()
                moveTo(22.88f, 8.99f)
                curveToRelative(-0.69f, -0.34f, -1.51f, -0.27f, -2.12f, 0.19f)
                lineToRelative(-1.8f, 1.35f)
                curveToRelative(-0.24f, -2.54f, -2.35f, -4.54f, -4.95f, -4.54f)
                horizontalLineToRelative(-0.07f)
                lineTo(9.81f, 1.88f)
                curveToRelative(-0.57f, -0.57f, -1.32f, -0.88f, -2.12f, -0.88f)
                lineTo(1f, 1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(7.68f, 3f)
                curveToRelative(0.26f, 0f, 0.52f, 0.11f, 0.71f, 0.29f)
                lineToRelative(2.71f, 2.71f)
                lineTo(5f, 6f)
                curveTo(2.24f, 6f, 0f, 8.24f, 0f, 11f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                lineTo(14f, 24f)
                curveToRelative(2.6f, 0f, 4.71f, -2.0f, 4.95f, -4.54f)
                lineToRelative(1.8f, 1.35f)
                curveToRelative(0.36f, 0.27f, 0.79f, 0.41f, 1.22f, 0.41f)
                curveToRelative(0.31f, 0f, 0.62f, -0.07f, 0.91f, -0.22f)
                curveToRelative(0.69f, -0.35f, 1.12f, -1.04f, 1.12f, -1.81f)
                lineTo(24f, 10.81f)
                curveToRelative(0f, -0.77f, -0.43f, -1.47f, -1.12f, -1.81f)
                close()
                moveTo(17f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 11f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(14f, 8f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(8f)
                close()
                moveTo(21.95f, 19.22f)
                lineToRelative(-2.95f, -2.22f)
                verticalLineToRelative(-4.0f)
                lineToRelative(3.0f, -2.21f)
                verticalLineToRelative(0.01f)
                lineToRelative(-0.04f, 8.41f)
                close()
            }
        }.also { _Camcorder = it}
