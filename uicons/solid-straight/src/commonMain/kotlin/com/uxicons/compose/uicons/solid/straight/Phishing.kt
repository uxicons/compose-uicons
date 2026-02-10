package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Phishing: ImageVector? = null

val Icons.Ss.Phishing: ImageVector
    get() = _Phishing ?: UXIcon(name = "Phishing") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.57f, 6f)
                horizontalLineToRelative(-2.35f)
                curveToRelative(-0.27f, -0.3f, -0.59f, -0.56f, -0.98f, -0.73f)
                curveToRelative(-1.36f, -0.62f, -2.24f, -1.96f, -2.24f, -3.4f)
                verticalLineToRelative(-1.87f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.87f)
                curveToRelative(0f, 0.67f, 0.41f, 1.28f, 1.07f, 1.58f)
                curveToRelative(1.17f, 0.53f, 2.02f, 1.45f, 2.5f, 2.55f)
                close()
                moveTo(9.93f, 19f)
                horizontalLineToRelative(4.16f)
                lineToRelative(0.85f, -1f)
                horizontalLineToRelative(7.07f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(-5.43f)
                curveToRelative(0.42f, 0.96f, 0.55f, 2.06f, 0.29f, 3.17f)
                curveToRelative(-0.42f, 1.83f, -1.87f, 3.28f, -3.7f, 3.7f)
                curveToRelative(-0.38f, 0.09f, -0.78f, 0.13f, -1.17f, 0.13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                curveToRelative(0.24f, 0f, 0.48f, -0.03f, 0.72f, -0.08f)
                curveToRelative(1.07f, -0.24f, 1.95f, -1.13f, 2.2f, -2.2f)
                curveToRelative(0.23f, -1.01f, -0.05f, -2.01f, -0.69f, -2.72f)
                horizontalLineToRelative(-5.22f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(7.08f)
                lineToRelative(0.85f, 1f)
                close()
                moveTo(15.86f, 20f)
                lineTo(15.01f, 21f)
                horizontalLineToRelative(-6.02f)
                lineToRelative(-0.85f, -1f)
                horizontalLineToRelative(-8.14f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _Phishing = it}
