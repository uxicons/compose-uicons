package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletChange: ImageVector? = null

val Icons.Rs.WalletChange: ImageVector
    get() = _WalletChange ?: UXIcon(name = "WalletChange") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-10.26f)
                curveToRelative(0.17f, -0.64f, 0.26f, -1.31f, 0.26f, -2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(-19f)
                curveToRelative(-0.35f, 0f, -0.69f, -0.07f, -1f, -0.18f)
                verticalLineToRelative(5.26f)
                curveToRelative(-0.75f, 0.44f, -1.43f, 0.99f, -2f, 1.64f)
                verticalLineToRelative(-9.72f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-21f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(10f, 13.53f)
                curveToRelative(-1.08f, -0.97f, -2.48f, -1.53f, -4f, -1.53f)
                curveToRelative(-2.97f, 0f, -5.43f, 2.17f, -5.91f, 5f)
                horizontalLineToRelative(2.05f)
                curveToRelative(0.45f, -1.72f, 2.0f, -3f, 3.86f, -3f)
                curveToRelative(1f, 0f, 1.93f, 0.37f, 2.64f, 1f)
                horizontalLineToRelative(-1.64f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(6f, 22f)
                curveToRelative(-0.99f, 0f, -1.93f, -0.37f, -2.65f, -1f)
                horizontalLineToRelative(1.65f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.53f)
                curveToRelative(1.08f, 0.97f, 2.49f, 1.53f, 4f, 1.53f)
                curveToRelative(2.97f, 0f, 5.43f, -2.17f, 5.91f, -5f)
                horizontalLineToRelative(-2.05f)
                curveToRelative(-0.45f, 1.72f, -2.0f, 3f, -3.86f, 3f)
                close()
            }
        }.also { _WalletChange = it}
