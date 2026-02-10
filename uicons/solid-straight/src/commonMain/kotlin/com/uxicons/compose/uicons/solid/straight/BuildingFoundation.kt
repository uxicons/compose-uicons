package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BuildingFoundation: ImageVector? = null

val Icons.Ss.BuildingFoundation: ImageVector
    get() = _BuildingFoundation ?: UXIcon(name = "BuildingFoundation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                verticalLineToRelative(5.13f)
                lineToRelative(-6f, -3.13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                lineToRelative(-6f, 3.13f)
                verticalLineToRelative(-5.13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(19.64f)
                lineToRelative(8.27f, 4.36f)
                horizontalLineToRelative(1.46f)
                lineToRelative(8.27f, -4.36f)
                verticalLineToRelative(-19.64f)
                close()
                moveTo(18.45f, 7.11f)
                lineTo(13f, 9.95f)
                verticalLineToRelative(-5.7f)
                close()
                moveTo(11f, 18.45f)
                lineTo(5.55f, 15.61f)
                lineTo(11f, 12.76f)
                verticalLineToRelative(5.7f)
                close()
                moveTo(13f, 12.76f)
                lineTo(18.45f, 15.6f)
                lineTo(13f, 18.45f)
                verticalLineToRelative(-5.7f)
                close()
                moveTo(11f, 4.25f)
                verticalLineToRelative(5.7f)
                lineToRelative(-5.45f, -2.85f)
                lineToRelative(5.45f, -2.85f)
                close()
                moveTo(5f, 9.07f)
                lineTo(9.36f, 11.35f)
                lineTo(5f, 13.63f)
                close()
                moveTo(19f, 13.63f)
                lineTo(14.64f, 11.35f)
                lineTo(19f, 9.07f)
                close()
            }
        }.also { _BuildingFoundation = it}
