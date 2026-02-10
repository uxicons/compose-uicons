package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BuildingFoundation: ImageVector? = null

val Icons.Bs.BuildingFoundation: ImageVector
    get() = _BuildingFoundation ?: UXIcon(name = "BuildingFoundation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 0f)
                verticalLineToRelative(4.4f)
                lineToRelative(-4.5f, -2.7f)
                verticalLineToRelative(-1.7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1.7f)
                lineToRelative(-4.5f, 2.7f)
                verticalLineToRelative(-4.4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(19.18f)
                lineToRelative(8.14f, 4.82f)
                horizontalLineToRelative(1.72f)
                lineToRelative(8.14f, -4.82f)
                verticalLineToRelative(-19.18f)
                close()
                moveTo(6f, 9.07f)
                lineTo(9.22f, 11f)
                lineTo(6f, 12.93f)
                verticalLineToRelative(-3.87f)
                close()
                moveTo(10.5f, 17.96f)
                lineTo(6f, 15.27f)
                lineTo(10.5f, 12.56f)
                close()
                moveTo(10.5f, 9.43f)
                lineTo(6f, 6.73f)
                lineTo(10.5f, 4.03f)
                close()
                moveTo(13.5f, 17.96f)
                verticalLineToRelative(-5.4f)
                lineToRelative(4.5f, 2.7f)
                close()
                moveTo(18f, 12.93f)
                lineTo(14.78f, 11.0f)
                lineTo(18f, 9.06f)
                verticalLineToRelative(3.87f)
                close()
                moveTo(13.5f, 9.43f)
                verticalLineToRelative(-5.4f)
                lineToRelative(4.5f, 2.7f)
                lineToRelative(-4.5f, 2.7f)
                close()
            }
        }.also { _BuildingFoundation = it}
