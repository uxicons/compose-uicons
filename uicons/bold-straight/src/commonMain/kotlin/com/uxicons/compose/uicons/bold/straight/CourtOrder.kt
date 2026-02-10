package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CourtOrder: ImageVector? = null

val Icons.Bs.CourtOrder: ImageVector
    get() = _CourtOrder ?: UXIcon(name = "CourtOrder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.97f, 10f)
                horizontalLineToRelative(-0.97f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(0.97f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8.97f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8.97f)
                close()
                moveTo(11.97f, 4f)
                horizontalLineToRelative(2.03f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2.03f)
                close()
                moveTo(19f, 21f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(20.43f, 15.44f)
                lineTo(19.57f, 12.56f)
                lineTo(22.96f, 11.56f)
                lineTo(23.81f, 14.44f)
                close()
                moveTo(20.43f, 16.06f)
                lineTo(23.81f, 17.06f)
                lineTo(22.96f, 19.94f)
                lineTo(19.57f, 18.94f)
                close()
                moveTo(2.19f, 14.44f)
                lineTo(3.04f, 11.56f)
                lineTo(6.42f, 12.56f)
                lineTo(5.58f, 15.44f)
                close()
                moveTo(6.42f, 18.94f)
                lineTo(3.04f, 19.94f)
                lineTo(2.19f, 17.06f)
                lineTo(5.58f, 16.06f)
                close()
            }
        }.also { _CourtOrder = it}
