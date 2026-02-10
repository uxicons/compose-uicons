package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DumbbellWeightlifting: ImageVector? = null

val Icons.Bs.DumbbellWeightlifting: ImageVector
    get() = _DumbbellWeightlifting ?: UXIcon(name = "DumbbellWeightlifting") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2f)
                horizontalLineToRelative(-1f)
                lineTo(23f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                lineTo(4f, 2f)
                lineTo(4f, 0f)
                lineTo(1f, 0f)
                verticalLineToRelative(2f)
                lineTo(0f, 2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.64f)
                lineToRelative(2.36f, 7.54f)
                verticalLineToRelative(11.46f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-11.46f)
                lineToRelative(2.36f, -7.54f)
                horizontalLineToRelative(1.64f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                close()
                moveTo(14.5f, 7.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _DumbbellWeightlifting = it}
