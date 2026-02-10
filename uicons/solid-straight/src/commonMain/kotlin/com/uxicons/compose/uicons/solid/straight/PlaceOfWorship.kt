package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaceOfWorship: ImageVector? = null

val Icons.Ss.PlaceOfWorship: ImageVector
    get() = _PlaceOfWorship ?: UXIcon(name = "PlaceOfWorship") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                lineTo(17f, 3.76f)
                lineTo(12f, 0.01f)
                lineToRelative(-5f, 3.75f)
                verticalLineToRelative(20.24f)
                close()
                moveTo(12f, 10f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(13f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(5f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-10.2f)
                lineToRelative(5f, -3.79f)
                verticalLineToRelative(13.99f)
                close()
                moveTo(24f, 13.54f)
                verticalLineToRelative(10.46f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-14.04f)
                lineToRelative(5f, 3.57f)
                close()
            }
        }.also { _PlaceOfWorship = it}
