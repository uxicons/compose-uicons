package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CourtOrder: ImageVector? = null

val Icons.Rs.CourtOrder: ImageVector
    get() = _CourtOrder ?: UXIcon(name = "CourtOrder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.17f, 12f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9f)
                close()
                moveTo(11.17f, 5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(11.17f, 12f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                close()
                moveTo(15.17f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                close()
                moveTo(19.17f, 20f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(9.17f, 20f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(20.45f, 14.96f)
                lineTo(19.88f, 13.04f)
                lineTo(23.27f, 12.04f)
                lineTo(23.83f, 13.96f)
                close()
                moveTo(20.45f, 16.54f)
                lineTo(23.83f, 17.54f)
                lineTo(23.27f, 19.46f)
                lineTo(19.88f, 18.46f)
                close()
                moveTo(2.5f, 13.96f)
                lineTo(3.06f, 12.04f)
                lineTo(6.45f, 13.04f)
                lineTo(5.88f, 14.96f)
                close()
                moveTo(6.45f, 18.46f)
                lineTo(3.06f, 19.46f)
                lineTo(2.5f, 17.54f)
                lineTo(5.88f, 16.54f)
                close()
            }
        }.also { _CourtOrder = it}
