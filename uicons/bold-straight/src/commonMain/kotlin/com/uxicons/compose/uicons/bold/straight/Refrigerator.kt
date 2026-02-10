package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Refrigerator: ImageVector? = null

val Icons.Bs.Refrigerator: ImageVector
    get() = _Refrigerator ?: UXIcon(name = "Refrigerator") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 0f)
                lineTo(5.5f, 0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(20f)
                lineTo(22f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(5.5f, 3f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                lineTo(5f, 9f)
                lineTo(5f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(5f, 21f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(9f)
                lineTo(5f, 21f)
                close()
            }
        }.also { _Refrigerator = it}
