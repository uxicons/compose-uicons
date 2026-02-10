package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilterList: ImageVector? = null

val Icons.Sr.FilterList: ImageVector
    get() = _FilterList ?: UXIcon(name = "FilterList") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 22f)
                curveToRelative(-0.21f, 0f, -0.42f, -0.07f, -0.6f, -0.2f)
                lineToRelative(-4f, -3f)
                curveToRelative(-0.25f, -0.19f, -0.4f, -0.48f, -0.4f, -0.8f)
                verticalLineToRelative(-3.63f)
                lineTo(0.94f, 8.47f)
                curveToRelative(-0.61f, -0.71f, -0.94f, -1.62f, -0.94f, -2.55f)
                curveToRelative(0f, -2.16f, 1.76f, -3.92f, 3.92f, -3.92f)
                horizontalLineToRelative(10.16f)
                curveToRelative(2.16f, 0f, 3.92f, 1.76f, 3.92f, 3.92f)
                curveToRelative(0f, 0.94f, -0.34f, 1.84f, -0.94f, 2.55f)
                lineToRelative(-5.06f, 5.9f)
                verticalLineToRelative(6.63f)
                curveToRelative(0f, 0.38f, -0.21f, 0.72f, -0.55f, 0.9f)
                curveToRelative(-0.14f, 0.07f, -0.29f, 0.1f, -0.45f, 0.1f)
                close()
                moveTo(24f, 20f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(24f, 16f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _FilterList = it}
