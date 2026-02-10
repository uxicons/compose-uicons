package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bong: ImageVector? = null

val Icons.Rr.Bong: ImageVector
    get() = _Bong ?: UXIcon(name = "Bong") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.16f, 7.48f)
                lineToRelative(-3.06f, -2.5f)
                curveToRelative(-0.43f, -0.35f, -1.06f, -0.29f, -1.41f, 0.14f)
                curveToRelative(-0.35f, 0.43f, -0.29f, 1.06f, 0.14f, 1.41f)
                lineToRelative(0.75f, 0.62f)
                lineToRelative(-1.43f, 1.74f)
                curveToRelative(-0.67f, -0.45f, -1.39f, -0.83f, -2.17f, -1.13f)
                lineTo(16.0f, 2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                verticalLineToRelative(5.75f)
                curveToRelative(-4.22f, 1.64f, -7f, 5.67f, -7f, 10.25f)
                curveToRelative(0.06f, 3.19f, 2.76f, 6f, 6.0f, 6f)
                horizontalLineToRelative(9.99f)
                curveToRelative(3.25f, 0f, 5.94f, -2.81f, 6.0f, -6f)
                curveToRelative(0f, -3.04f, -1.23f, -5.84f, -3.28f, -7.85f)
                lineToRelative(1.42f, -1.74f)
                lineToRelative(0.75f, 0.62f)
                curveToRelative(0.19f, 0.15f, 0.41f, 0.23f, 0.63f, 0.23f)
                curveToRelative(0.29f, 0f, 0.58f, -0.12f, 0.77f, -0.37f)
                curveToRelative(0.35f, -0.43f, 0.29f, -1.06f, -0.14f, -1.41f)
                close()
                moveTo(21f, 18f)
                curveToRelative(-0.04f, 2.11f, -1.84f, 4f, -4.0f, 4f)
                lineTo(7.0f, 22f)
                curveToRelative(-2.17f, 0f, -3.96f, -1.9f, -4.0f, -4f)
                curveToRelative(0f, -0.69f, 0.08f, -1.35f, 0.22f, -2f)
                horizontalLineToRelative(13.78f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(3.93f, 14f)
                curveToRelative(1.06f, -2.15f, 2.96f, -3.83f, 5.37f, -4.59f)
                curveToRelative(0.42f, -0.13f, 0.7f, -0.52f, 0.7f, -0.95f)
                lineTo(10.0f, 2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(6.46f)
                curveToRelative(0f, 0.44f, 0.28f, 0.82f, 0.7f, 0.95f)
                curveToRelative(3.77f, 1.18f, 6.3f, 4.63f, 6.3f, 8.59f)
                close()
            }
        }.also { _Bong = it}
