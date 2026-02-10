package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeyLockCrypto: ImageVector? = null

val Icons.Ss.KeyLockCrypto: ImageVector
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
                moveTo(21.89f, 8f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(4.88f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                close()
                moveTo(16.01f, 18f)
                curveToRelative(0f, -0.91f, -0.41f, -1.73f, -1.05f, -2.27f)
                curveToRelative(0.34f, -0.49f, 0.55f, -1.08f, 0.55f, -1.73f)
                curveToRelative(0f, -1.49f, -1.09f, -2.71f, -2.51f, -2.95f)
                lineToRelative(-0.01f, -1.06f)
                lineToRelative(-2f, 0.01f)
                lineToRelative(0.01f, 0.99f)
                horizontalLineToRelative(-1.99f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(1.99f)
                lineToRelative(-0.01f, 0.99f)
                lineToRelative(2f, 0.01f)
                lineToRelative(0.01f, -1.01f)
                horizontalLineToRelative(0.01f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                close()
                moveTo(16.89f, 7f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _KeyLockCrypto = it}
