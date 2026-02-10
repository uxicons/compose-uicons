package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BenefitDiamond: ImageVector? = null

val Icons.Sr.BenefitDiamond: ImageVector
    get() = _BenefitDiamond ?: UXIcon(name = "BenefitDiamond") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.58f, 0.8f)
                lineToRelative(1.56f, 2.08f)
                curveToRelative(0.49f, 0.66f, 0.46f, 1.56f, -0.07f, 2.19f)
                lineToRelative(-5.57f, 5.93f)
                lineToRelative(2.06f, -6f)
                horizontalLineToRelative(-4.12f)
                lineToRelative(2.06f, 6f)
                lineTo(3.93f, 5.07f)
                curveToRelative(-0.53f, -0.62f, -0.56f, -1.53f, -0.07f, -2.19f)
                lineToRelative(1.56f, -2.08f)
                curveToRelative(0.38f, -0.5f, 0.97f, -0.8f, 1.6f, -0.8f)
                horizontalLineToRelative(1.6f)
                lineToRelative(-1.13f, 3f)
                horizontalLineToRelative(4f)
                lineToRelative(-1.13f, -3f)
                horizontalLineToRelative(1.61f)
                curveToRelative(0.63f, 0f, 1.22f, 0.3f, 1.6f, 0.8f)
                close()
                moveTo(23.15f, 8.68f)
                curveToRelative(-0.52f, -0.47f, -1.19f, -0.71f, -1.88f, -0.68f)
                curveToRelative(-0.7f, 0.03f, -1.34f, 0.33f, -1.79f, 0.83f)
                lineToRelative(-3.54f, 3.74f)
                curveToRelative(0.03f, 0.21f, 0.07f, 0.42f, 0.07f, 0.64f)
                curveToRelative(0f, 2.08f, -1.55f, 3.88f, -3.62f, 4.17f)
                lineToRelative(-4.25f, 0.6f)
                curveToRelative(-0.55f, 0.08f, -1.05f, -0.3f, -1.13f, -0.85f)
                curveToRelative(-0.08f, -0.55f, 0.3f, -1.05f, 0.85f, -1.13f)
                lineToRelative(4.16f, -0.58f)
                curveToRelative(0.94f, -0.13f, 1.75f, -0.81f, 1.94f, -1.73f)
                curveToRelative(0.3f, -1.43f, -0.79f, -2.69f, -2.16f, -2.69f)
                horizontalLineToRelative(-7.79f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(4.26f)
                curveToRelative(2.81f, 0f, 5.48f, -1.18f, 7.37f, -3.25f)
                lineToRelative(7.7f, -8.41f)
                curveToRelative(0.95f, -1.06f, 0.86f, -2.71f, -0.19f, -3.67f)
                close()
            }
        }.also { _BenefitDiamond = it}
