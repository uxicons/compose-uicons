package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BuildingFoundation: ImageVector? = null

val Icons.Rs.BuildingFoundation: ImageVector
    get() = _BuildingFoundation ?: UXIcon(name = "BuildingFoundation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                verticalLineToRelative(4.03f)
                lineToRelative(-6f, -3.13f)
                verticalLineToRelative(-0.9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(0.9f)
                lineToRelative(-6f, 3.13f)
                verticalLineToRelative(-4.03f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(19.64f)
                lineToRelative(8.27f, 4.36f)
                horizontalLineToRelative(1.46f)
                lineToRelative(8.27f, -4.36f)
                verticalLineToRelative(-19.64f)
                close()
                moveTo(18.45f, 6f)
                lineTo(13f, 8.85f)
                verticalLineToRelative(-5.7f)
                close()
                moveTo(11f, 17.35f)
                lineTo(5.55f, 14.5f)
                lineTo(11f, 11.65f)
                verticalLineToRelative(5.7f)
                close()
                moveTo(13f, 11.65f)
                lineTo(18.45f, 14.5f)
                lineTo(13f, 17.35f)
                verticalLineToRelative(-5.7f)
                close()
                moveTo(11f, 3.15f)
                verticalLineToRelative(5.7f)
                lineToRelative(-5.45f, -2.85f)
                lineToRelative(5.45f, -2.85f)
                close()
                moveTo(5f, 7.97f)
                lineTo(9.36f, 10.25f)
                lineTo(5f, 12.53f)
                close()
                moveTo(19f, 18.43f)
                lineTo(12.23f, 22f)
                horizontalLineToRelative(-0.47f)
                lineToRelative(-6.77f, -3.56f)
                verticalLineToRelative(-1.97f)
                lineToRelative(7f, 3.66f)
                lineToRelative(7f, -3.66f)
                close()
                moveTo(19f, 12.53f)
                lineTo(14.64f, 10.25f)
                lineTo(19f, 7.97f)
                close()
            }
        }.also { _BuildingFoundation = it}
