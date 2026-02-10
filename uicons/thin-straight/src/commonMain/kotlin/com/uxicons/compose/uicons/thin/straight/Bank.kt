package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bank: ImageVector? = null

val Icons.Ts.Bank: ImageVector
    get() = _Bank ?: UXIcon(name = "Bank") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 23f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(1f)
                lineTo(0f, 24f)
                verticalLineToRelative(-1f)
                close()
                moveTo(24f, 7.55f)
                verticalLineToRelative(1.45f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                lineTo(1f, 20f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-10f)
                lineTo(0f, 9f)
                verticalLineToRelative(-1.45f)
                curveToRelative(0f, -1.15f, 0.64f, -2.17f, 1.66f, -2.68f)
                lineTo(10.78f, 0.31f)
                curveToRelative(0.76f, -0.41f, 1.69f, -0.42f, 2.46f, 0.01f)
                lineToRelative(9.1f, 4.54f)
                curveToRelative(1.02f, 0.51f, 1.66f, 1.54f, 1.66f, 2.68f)
                close()
                moveTo(4f, 19f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(10f)
                close()
                moveTo(15f, 9f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-10f)
                close()
                moveTo(20f, 9f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-10f)
                close()
                moveTo(23f, 7.55f)
                curveToRelative(0f, -0.76f, -0.42f, -1.45f, -1.11f, -1.79f)
                lineTo(12.78f, 1.2f)
                curveToRelative(-0.49f, -0.27f, -1.06f, -0.27f, -1.54f, -0.01f)
                lineTo(2.11f, 5.76f)
                curveToRelative(-0.68f, 0.34f, -1.11f, 1.03f, -1.11f, 1.79f)
                verticalLineToRelative(0.45f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-0.45f)
                close()
            }
        }.also { _Bank = it}
