package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stapler: ImageVector? = null

val Icons.Sr.Stapler: ImageVector
    get() = _Stapler ?: UXIcon(name = "Stapler") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 15.02f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-1.79f)
                lineToRelative(13f, 3.79f)
                close()
                moveTo(24f, 12.58f)
                verticalLineToRelative(5.42f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-21f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-4.56f)
                lineToRelative(-15.4f, -4.32f)
                curveToRelative(-1.14f, -0.29f, -1.82f, -1.45f, -1.54f, -2.59f)
                curveToRelative(0.63f, -2.51f, 3.18f, -4.02f, 5.69f, -3.38f)
                lineToRelative(13.95f, 3.77f)
                curveToRelative(2.55f, 0.7f, 4.31f, 3.02f, 4.29f, 5.66f)
                close()
                moveTo(22f, 15.52f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _Stapler = it}
