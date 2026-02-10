package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BuildingFoundation: ImageVector? = null

val Icons.Ts.BuildingFoundation: ImageVector
    get() = _BuildingFoundation ?: UXIcon(name = "BuildingFoundation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 0f)
                verticalLineToRelative(4.42f)
                lineToRelative(-7.5f, -3.92f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.5f)
                lineToRelative(-7.5f, 3.92f)
                verticalLineToRelative(-4.42f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(19.43f)
                lineToRelative(8.74f, 4.57f)
                horizontalLineToRelative(0.56f)
                lineToRelative(8.69f, -4.57f)
                verticalLineToRelative(-19.43f)
                close()
                moveTo(11.5f, 1.63f)
                verticalLineToRelative(7.84f)
                lineToRelative(-7.5f, -3.92f)
                close()
                moveTo(4f, 6.67f)
                lineTo(10.65f, 10.08f)
                lineTo(4f, 13.63f)
                close()
                moveTo(11.5f, 10.84f)
                verticalLineToRelative(7.84f)
                lineToRelative(-7.5f, -3.92f)
                lineToRelative(7.5f, -3.92f)
                close()
                moveTo(20f, 18.82f)
                lineTo(12.06f, 23f)
                lineTo(4f, 18.82f)
                verticalLineToRelative(-2.94f)
                lineToRelative(8f, 4.18f)
                lineToRelative(8f, -4.18f)
                close()
                moveTo(12.5f, 18.67f)
                verticalLineToRelative(-7.84f)
                lineToRelative(7.5f, 3.92f)
                lineToRelative(-7.5f, 3.92f)
                close()
                moveTo(20f, 13.63f)
                lineTo(13.35f, 10.15f)
                lineTo(20f, 6.67f)
                verticalLineToRelative(6.95f)
                close()
                moveTo(12.5f, 9.46f)
                verticalLineToRelative(-7.84f)
                lineToRelative(7.5f, 3.92f)
                close()
            }
        }.also { _BuildingFoundation = it}
