package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BuildingCheck: ImageVector? = null

val Icons.Bs.BuildingCheck: ImageVector
    get() = _BuildingCheck ?: UXIcon(name = "BuildingCheck") {
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
                moveTo(10f, 13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
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
                moveTo(21.95f, 14.93f)
                lineTo(16.0f, 20.8f)
                lineTo(12.55f, 17.43f)
                lineTo(10.45f, 19.57f)
                lineTo(14.23f, 23.27f)
                curveToRelative(0.49f, 0.49f, 1.13f, 0.73f, 1.77f, 0.73f)
                reflectiveCurveToRelative(1.27f, -0.24f, 1.76f, -0.72f)
                lineToRelative(6.24f, -6.21f)
                lineToRelative(-2.05f, -2.14f)
                close()
                moveTo(3f, 21f)
                verticalLineToRelative(-17.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(13.53f)
                lineToRelative(0.99f, 0.97f)
                lineToRelative(2.01f, -1.98f)
                verticalLineToRelative(-12.52f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-11f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(12.12f)
                lineToRelative(-3.07f, -3f)
                close()
            }
        }.also { _BuildingCheck = it}
