package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BitcoinCard: ImageVector? = null

val Icons.Sr.BitcoinCard: ImageVector
    get() = _BitcoinCard ?: UXIcon(name = "BitcoinCard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.01f, 12.5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(1.65f, 0f, 2.99f, -1.37f, 2.99f, -3f)
                curveToRelative(0f, -0.91f, -0.39f, -1.73f, -1.03f, -2.27f)
                curveToRelative(0.34f, -0.49f, 0.55f, -1.08f, 0.55f, -1.73f)
                curveToRelative(0f, -1.48f, -1.08f, -2.71f, -2.5f, -2.95f)
                verticalLineToRelative(-0.05f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                close()
                moveTo(19.01f, 4.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(19.01f, 8.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(15.01f, 9.5f)
                horizontalLineToRelative(-15.01f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(11.01f)
                close()
                moveTo(20.01f, 15.5f)
                curveToRelative(-1.01f, 0f, -1.91f, -0.51f, -2.45f, -1.28f)
                curveToRelative(-1.18f, -0.46f, -2.08f, -1.47f, -2.4f, -2.72f)
                horizontalLineToRelative(-15.15f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(16f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-5.01f)
                curveToRelative(-0.47f, 0.35f, -1.0f, 0.62f, -1.58f, 0.79f)
                curveToRelative(-0.55f, 0.74f, -1.42f, 1.23f, -2.41f, 1.23f)
                close()
                moveTo(5.5f, 18.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _BitcoinCard = it}
