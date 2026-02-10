package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VectorCircle: ImageVector? = null

val Icons.Bs.VectorCircle: ImageVector
    get() = _VectorCircle ?: UXIcon(name = "VectorCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9f)
                horizontalLineToRelative(-1.42f)
                curveToRelative(-1.04f, -3.66f, -3.93f, -6.55f, -7.58f, -7.58f)
                lineTo(15f, 0f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1.42f)
                curveToRelative(-3.66f, 1.04f, -6.55f, 3.93f, -7.58f, 7.58f)
                lineTo(0f, 9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.42f)
                curveToRelative(1.04f, 3.66f, 3.93f, 6.55f, 7.58f, 7.58f)
                verticalLineToRelative(1.42f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1.42f)
                curveToRelative(3.66f, -1.04f, 6.55f, -3.93f, 7.58f, -7.58f)
                horizontalLineToRelative(1.42f)
                verticalLineToRelative(-6f)
                close()
                moveTo(15f, 19.42f)
                verticalLineToRelative(-1.42f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1.42f)
                curveToRelative(-2.0f, -0.81f, -3.6f, -2.41f, -4.42f, -4.42f)
                horizontalLineToRelative(1.42f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1.42f)
                curveToRelative(0.81f, -2.0f, 2.41f, -3.6f, 4.42f, -4.42f)
                verticalLineToRelative(1.42f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1.42f)
                curveToRelative(2.0f, 0.81f, 3.6f, 2.41f, 4.42f, 4.42f)
                horizontalLineToRelative(-1.42f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.42f)
                curveToRelative(-0.81f, 2.0f, -2.41f, 3.6f, -4.42f, 4.42f)
                close()
            }
        }.also { _VectorCircle = it}
