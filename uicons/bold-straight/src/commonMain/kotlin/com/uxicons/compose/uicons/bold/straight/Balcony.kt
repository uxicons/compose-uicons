package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Balcony: ImageVector? = null

val Icons.Bs.Balcony: ImageVector
    get() = _Balcony ?: UXIcon(name = "Balcony") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 10f)
                lineTo(19f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(6.5f)
                lineTo(0f, 10f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineTo(20.5f, 24f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(24f, 10f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(10.5f, 13f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2.5f)
                lineTo(8f, 13f)
                horizontalLineToRelative(2.5f)
                close()
                moveTo(13.5f, 13f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2.5f)
                lineTo(13.5f, 13f)
                close()
                moveTo(8f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(6.5f)
                lineTo(8f, 10f)
                lineTo(8f, 3.5f)
                close()
                moveTo(3f, 20.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                close()
                moveTo(21f, 20.5f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.5f)
                lineTo(19f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7.5f)
                close()
            }
        }.also { _Balcony = it}
