package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BuildingXmark: ImageVector? = null

val Icons.Rs.BuildingXmark: ImageVector
    get() = _BuildingXmark ?: UXIcon(name = "BuildingXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-10f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(8.57f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(-12.57f)
                verticalLineToRelative(-21f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(7.6f)
                lineToRelative(-2f, 2f)
                close()
                moveTo(7f, 13f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(12f, 13f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(4f, 19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(9f, 19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(7f, 5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(12f, 5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(7f, 9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(12f, 9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(24f, 15.42f)
                lineTo(22.61f, 14.01f)
                lineTo(19.02f, 17.6f)
                lineTo(15.42f, 14.01f)
                lineTo(14.01f, 15.42f)
                lineTo(17.6f, 19.02f)
                lineTo(14.01f, 22.61f)
                lineTo(15.42f, 24.0f)
                lineTo(19.02f, 20.43f)
                lineTo(22.61f, 24.0f)
                lineTo(24f, 22.61f)
                lineTo(20.43f, 19.02f)
                close()
            }
        }.also { _BuildingXmark = it}
