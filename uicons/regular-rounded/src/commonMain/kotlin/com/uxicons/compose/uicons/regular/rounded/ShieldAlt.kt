package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldAlt: ImageVector? = null

val Icons.Rr.ShieldAlt: ImageVector
    get() = _ShieldAlt ?: UXIcon(name = "ShieldAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.57f, 2.13f)
                lineTo(12.34f, 0.06f)
                curveToRelative(-0.03f, -0.01f, -0.18f, -0.06f, -0.34f, -0.06f)
                reflectiveCurveToRelative(-0.31f, 0.05f, -0.34f, 0.06f)
                lineToRelative(-6.23f, 2.07f)
                curveToRelative(-2.05f, 0.68f, -3.43f, 2.59f, -3.43f, 4.75f)
                verticalLineToRelative(5.17f)
                curveToRelative(0f, 6.56f, 7.0f, 10.58f, 9.15f, 11.65f)
                lineToRelative(0.4f, 0.2f)
                curveToRelative(0.14f, 0.07f, 0.29f, 0.1f, 0.45f, 0.1f)
                curveToRelative(0.13f, 0f, 0.25f, -0.02f, 0.37f, -0.07f)
                lineToRelative(0.42f, -0.17f)
                curveToRelative(2.16f, -0.87f, 9.21f, -4.28f, 9.21f, -11.72f)
                verticalLineToRelative(-5.17f)
                curveToRelative(0f, -2.16f, -1.38f, -4.07f, -3.43f, -4.75f)
                close()
                moveTo(4f, 12.04f)
                verticalLineToRelative(-5.17f)
                curveToRelative(0f, -1.29f, 0.83f, -2.44f, 2.06f, -2.85f)
                lineToRelative(4.94f, -1.64f)
                verticalLineToRelative(18.96f)
                curveToRelative(-2.48f, -1.43f, -7f, -4.66f, -7f, -9.3f)
                close()
                moveTo(20f, 12.04f)
                curveToRelative(0f, 5.35f, -4.57f, 8.27f, -7f, 9.44f)
                lineTo(13f, 2.38f)
                lineToRelative(4.94f, 1.64f)
                curveToRelative(1.23f, 0.41f, 2.06f, 1.55f, 2.06f, 2.85f)
                verticalLineToRelative(5.17f)
                close()
            }
        }.also { _ShieldAlt = it}
