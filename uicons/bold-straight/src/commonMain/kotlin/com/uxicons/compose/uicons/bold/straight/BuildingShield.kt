package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BuildingShield: ImageVector? = null

val Icons.Bs.BuildingShield: ImageVector
    get() = _BuildingShield ?: UXIcon(name = "BuildingShield") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(8f, 10f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(8f, 5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(13f, 5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(24f, 14.02f)
                verticalLineToRelative(3.48f)
                curveToRelative(-0.26f, 4.57f, -3.74f, 5.7f, -5.57f, 6.5f)
                curveToRelative(-1.73f, -0.93f, -5.19f, -2.39f, -5.43f, -6.5f)
                verticalLineToRelative(-3.48f)
                curveToRelative(0f, -1.03f, 0.66f, -1.94f, 1.64f, -2.27f)
                lineToRelative(3.87f, -1.28f)
                lineToRelative(3.86f, 1.28f)
                curveToRelative(0.98f, 0.33f, 1.64f, 1.24f, 1.64f, 2.27f)
                close()
                moveTo(21f, 14.47f)
                lineTo(18.5f, 13.64f)
                lineTo(16f, 14.47f)
                verticalLineToRelative(3.03f)
                curveToRelative(0f, 1.52f, 1.69f, 2.7f, 2.56f, 3.21f)
                curveToRelative(0.9f, -0.45f, 2.44f, -1.46f, 2.44f, -3.21f)
                close()
                moveTo(10f, 13f)
                horizontalLineToRelative(1.13f)
                curveToRelative(0.26f, -1.09f, 0.93f, -2.03f, 1.87f, -2.64f)
                verticalLineToRelative(-0.36f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(11.92f, 21f)
                horizontalLineToRelative(-8.92f)
                verticalLineToRelative(-17.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(6.03f)
                lineToRelative(3f, -0.99f)
                verticalLineToRelative(-5.04f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-11f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(14.54f)
                curveToRelative(-0.94f, -0.73f, -1.93f, -1.73f, -2.62f, -3f)
                close()
            }
        }.also { _BuildingShield = it}
