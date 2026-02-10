package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LawBook: ImageVector? = null

val Icons.Ss.LawBook: ImageVector
    get() = _LawBook ?: UXIcon(name = "LawBook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 18f)
                verticalLineToRelative(-18f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(15.77f)
                curveToRelative(0.55f, -0.49f, 1.26f, -0.77f, 2f, -0.77f)
                close()
                moveTo(12.05f, 12f)
                horizontalLineToRelative(2.95f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(4.1f)
                close()
                moveTo(10.14f, 20f)
                horizontalLineToRelative(-8.14f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1.58f)
                curveToRelative(-0.9f, -0.53f, -1.58f, -1.4f, -1.86f, -2.42f)
                close()
                moveTo(12f, 19f)
                verticalLineToRelative(-0.34f)
                lineToRelative(1.5f, -4.66f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3.5f)
                lineToRelative(1.5f, 4.66f)
                verticalLineToRelative(0.34f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-0.34f)
                lineToRelative(0.84f, -2.66f)
                horizontalLineToRelative(-1.84f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1.84f)
                lineToRelative(0.84f, 2.66f)
                verticalLineToRelative(0.34f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
            }
        }.also { _LawBook = it}
