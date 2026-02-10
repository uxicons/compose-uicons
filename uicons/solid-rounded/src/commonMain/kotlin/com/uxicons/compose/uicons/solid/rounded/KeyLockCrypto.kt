package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeyLockCrypto: ImageVector? = null

val Icons.Sr.KeyLockCrypto: ImageVector
    get() = _KeyLockCrypto ?: UXIcon(name = "KeyLockCrypto") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.51f, 13f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(13.01f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(22f, 13f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(7f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.04f, 1.24f, -3.8f, 3f, -4.58f)
                verticalLineToRelative(-1.42f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                verticalLineToRelative(1.42f)
                curveToRelative(1.76f, 0.77f, 3f, 2.53f, 3f, 4.58f)
                close()
                moveTo(16.01f, 18f)
                curveToRelative(0f, -0.91f, -0.41f, -1.73f, -1.05f, -2.27f)
                curveToRelative(0.34f, -0.49f, 0.55f, -1.08f, 0.55f, -1.73f)
                curveToRelative(0f, -1.49f, -1.09f, -2.72f, -2.51f, -2.95f)
                verticalLineToRelative(-0.06f)
                curveToRelative(-0.01f, -0.55f, -0.48f, -1.03f, -1.01f, -0.99f)
                curveToRelative(-0.55f, 0.01f, -0.98f, 0.46f, -0.98f, 1.0f)
                curveToRelative(-1.1f, 0.01f, -1.99f, 0.9f, -1.99f, 2.0f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.1f, 0.89f, 1.99f, 1.99f, 2.0f)
                curveToRelative(0f, 0.55f, 0.44f, 0.99f, 0.98f, 1.0f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.55f, 0f, 0.99f, -0.44f, 1f, -0.99f)
                verticalLineToRelative(-0.01f)
                horizontalLineToRelative(0.01f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                close()
                moveTo(17f, 7f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _KeyLockCrypto = it}
