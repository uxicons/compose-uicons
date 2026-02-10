package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletNft: ImageVector? = null

val Icons.Ss.WalletNft: ImageVector
    get() = _WalletNft ?: UXIcon(name = "WalletNft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(24f, 10f)
                verticalLineToRelative(14f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(0f, 9f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3f)
                lineTo(6f, 3.75f)
                lineTo(12.5f, 0f)
                lineToRelative(6.5f, 3.75f)
                verticalLineToRelative(6.25f)
                horizontalLineToRelative(5f)
                close()
                moveTo(10.5f, 5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2.77f)
                lineToRelative(-1.54f, -2.77f)
                horizontalLineToRelative(-0.96f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2.87f)
                lineToRelative(1.59f, 2.87f)
                horizontalLineToRelative(0.91f)
                lineTo(10.5f, 5f)
                close()
                moveTo(14.0f, 7.01f)
                lineToRelative(-1.5f, -0.0f)
                verticalLineToRelative(-1.01f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1.99f)
                lineToRelative(1.5f, 0.0f)
                lineToRelative(0.0f, -1f)
                close()
                moveTo(15f, 6.01f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.99f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3.99f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                close()
                moveTo(20f, 17f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _WalletNft = it}
