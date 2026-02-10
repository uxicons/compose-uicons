package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadphonesRhythm: ImageVector? = null

val Icons.Ss.HeadphonesRhythm: ImageVector
    get() = _HeadphonesRhythm ?: UXIcon(name = "HeadphonesRhythm") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 12.42f)
                verticalLineToRelative(-1.42f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveToRelative(-9f, 4.04f, -9f, 9f)
                verticalLineToRelative(1.42f)
                curveToRelative(-1.76f, 0.77f, -3f, 2.53f, -3f, 4.58f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(2f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                curveToRelative(0f, -2.04f, -1.24f, -3.8f, -3f, -4.58f)
                close()
                moveTo(13.89f, 16f)
                horizontalLineToRelative(2.11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-0.89f)
                lineToRelative(-1.97f, 3.88f)
                lineToRelative(-2.35f, -5.22f)
                lineToRelative(-0.71f, 1.34f)
                horizontalLineToRelative(-2.09f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(0.89f)
                lineToRelative(2.06f, -3.89f)
                lineToRelative(2.31f, 5.14f)
                close()
            }
        }.also { _HeadphonesRhythm = it}
