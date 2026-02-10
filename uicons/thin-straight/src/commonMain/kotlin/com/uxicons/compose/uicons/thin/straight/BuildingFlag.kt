package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BuildingFlag: ImageVector? = null

val Icons.Ts.BuildingFlag: ImageVector
    get() = _BuildingFlag ?: UXIcon(name = "BuildingFlag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 13f)
                lineToRelative(-8.0f, -4f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(16f, 10.12f)
                lineTo(21.8f, 13f)
                lineTo(16f, 15.88f)
                close()
                moveTo(15f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-11f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-13f)
                verticalLineToRelative(-21.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(7f, 14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                close()
                moveTo(12f, 14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                close()
                moveTo(4f, 17f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(9f, 17f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(7f, 6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                close()
                moveTo(12f, 6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                close()
                moveTo(7f, 10f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                close()
                moveTo(12f, 10f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _BuildingFlag = it}
