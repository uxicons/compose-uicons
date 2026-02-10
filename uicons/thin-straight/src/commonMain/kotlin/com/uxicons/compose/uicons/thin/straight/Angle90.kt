package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Angle90: ImageVector? = null

val Icons.Ts.Angle90: ImageVector
    get() = _Angle90 ?: UXIcon(name = "Angle90") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.36f, 13.54f)
                curveToRelative(-0.76f, -1.66f, -1.76f, -3.18f, -2.97f, -4.52f)
                lineToRelative(0.71f, -0.71f)
                curveToRelative(1.3f, 1.44f, 2.38f, 3.08f, 3.19f, 4.87f)
                lineToRelative(-0.93f, 0.36f)
                close()
                moveTo(15.69f, 6.9f)
                curveToRelative(-1.44f, -1.3f, -3.08f, -2.38f, -4.87f, -3.19f)
                lineToRelative(-0.36f, 0.93f)
                curveToRelative(1.66f, 0.76f, 3.18f, 1.76f, 4.52f, 2.97f)
                lineToRelative(0.71f, -0.71f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -2.08f, -0.35f, -4.08f, -0.97f, -5.96f)
                lineToRelative(-0.93f, 0.36f)
                curveToRelative(0.58f, 1.76f, 0.9f, 3.64f, 0.9f, 5.6f)
                close()
                moveTo(8.96f, 2.97f)
                curveToRelative(-1.88f, -0.62f, -3.88f, -0.97f, -5.96f, -0.97f)
                verticalLineToRelative(1f)
                curveToRelative(1.96f, 0f, 3.83f, 0.32f, 5.6f, 0.9f)
                lineToRelative(0.36f, -0.93f)
                close()
                moveTo(2.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(1f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(21.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(21.5f)
                verticalLineToRelative(-1f)
                lineTo(2.5f, 23f)
                close()
            }
        }.also { _Angle90 = it}
