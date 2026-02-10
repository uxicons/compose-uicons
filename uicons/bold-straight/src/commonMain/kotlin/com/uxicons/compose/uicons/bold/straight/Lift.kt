package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lift: ImageVector? = null

val Icons.Bs.Lift: ImageVector
    get() = _Lift ?: UXIcon(name = "Lift") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 21f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-18f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(6.67f)
                lineToRelative(3f, -3f)
                verticalLineToRelative(-3.67f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-12f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(19f)
                verticalLineToRelative(-7.17f)
                lineToRelative(-3f, -3f)
                close()
                moveTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(18f, 13f)
                horizontalLineToRelative(6f)
                lineToRelative(-3f, 3f)
                close()
                moveTo(18f, 11f)
                lineTo(21f, 8f)
                lineTo(24f, 11f)
                close()
            }
        }.also { _Lift = it}
