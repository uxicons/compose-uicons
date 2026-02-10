package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MakeupBrush: ImageVector? = null

val Icons.Ts.MakeupBrush: ImageVector
    get() = _MakeupBrush ?: UXIcon(name = "MakeupBrush") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.0f, 2.82f)
                lineTo(21.18f, -0.0f)
                lineTo(6.23f, 13.57f)
                lineToRelative(-6.23f, 2.45f)
                verticalLineToRelative(1.48f)
                curveToRelative(0f, 3.58f, 2.92f, 6.5f, 6.5f, 6.5f)
                horizontalLineToRelative(1.49f)
                lineToRelative(2.44f, -6.23f)
                lineTo(24.0f, 2.82f)
                close()
                moveTo(9.98f, 16.77f)
                lineToRelative(-2.76f, -2.76f)
                lineToRelative(2.14f, -1.95f)
                lineToRelative(2.56f, 2.56f)
                lineToRelative(-1.95f, 2.14f)
                close()
                moveTo(22.62f, 2.86f)
                lineToRelative(-10.02f, 11.04f)
                lineToRelative(-2.49f, -2.49f)
                lineTo(21.14f, 1.38f)
                lineToRelative(1.48f, 1.48f)
                close()
                moveTo(7.31f, 23f)
                horizontalLineToRelative(-0.81f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                verticalLineToRelative(-0.8f)
                lineToRelative(5.38f, -2.12f)
                lineToRelative(3.04f, 3.04f)
                lineToRelative(-2.11f, 5.38f)
                close()
            }
        }.also { _MakeupBrush = it}
