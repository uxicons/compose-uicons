package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CourtOrder: ImageVector? = null

val Icons.Ss.CourtOrder: ImageVector
    get() = _CourtOrder ?: UXIcon(name = "CourtOrder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 8f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(8f, 14f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-10f)
                close()
                moveTo(18f, 0f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                close()
                moveTo(19f, 22f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(23.67f, 14.5f)
                lineTo(23.1f, 12.58f)
                lineTo(19.72f, 13.58f)
                lineTo(20.28f, 15.5f)
                close()
                moveTo(19.72f, 19f)
                lineTo(23.1f, 20f)
                lineTo(23.67f, 18.08f)
                lineTo(20.28f, 17.08f)
                close()
                moveTo(5.72f, 15.5f)
                lineTo(6.28f, 13.58f)
                lineTo(2.9f, 12.58f)
                lineTo(2.33f, 14.5f)
                close()
                moveTo(5.72f, 17.08f)
                lineTo(2.33f, 18.08f)
                lineTo(2.9f, 20f)
                lineTo(6.28f, 19f)
                close()
            }
        }.also { _CourtOrder = it}
