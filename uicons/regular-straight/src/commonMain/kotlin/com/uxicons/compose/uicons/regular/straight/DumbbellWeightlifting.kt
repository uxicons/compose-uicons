package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DumbbellWeightlifting: ImageVector? = null

val Icons.Rs.DumbbellWeightlifting: ImageVector
    get() = _DumbbellWeightlifting ?: UXIcon(name = "DumbbellWeightlifting") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2f)
                horizontalLineToRelative(-1f)
                lineTo(23f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                lineTo(3f, 2f)
                lineTo(3f, 0f)
                lineTo(1f, 0f)
                verticalLineToRelative(2f)
                lineTo(0f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(0.97f)
                lineToRelative(5.03f, 7.31f)
                verticalLineToRelative(12.69f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-12.69f)
                lineToRelative(5.03f, -7.31f)
                horizontalLineToRelative(0.97f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                close()
                moveTo(11f, 17f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(13.47f, 10f)
                horizontalLineToRelative(-2.95f)
                lineToRelative(-4.12f, -6f)
                horizontalLineToRelative(11.2f)
                lineToRelative(-4.12f, 6f)
                close()
                moveTo(10f, 7f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
            }
        }.also { _DumbbellWeightlifting = it}
