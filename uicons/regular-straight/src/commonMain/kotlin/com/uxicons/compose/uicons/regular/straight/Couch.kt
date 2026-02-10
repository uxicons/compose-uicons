package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Couch: ImageVector? = null

val Icons.Rs.Couch: ImageVector
    get() = _Couch ?: UXIcon(name = "Couch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(7f, 1f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(3f)
                lineTo(0f, 9f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-12f)
                close()
                moveTo(7f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(3.17f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.52f, -2f, 2.83f)
                verticalLineToRelative(2f)
                lineTo(6f, 14f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.3f, -0.84f, -2.42f, -2f, -2.83f)
                verticalLineToRelative(-3.17f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(22f, 19f)
                lineTo(2f, 19f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _Couch = it}
