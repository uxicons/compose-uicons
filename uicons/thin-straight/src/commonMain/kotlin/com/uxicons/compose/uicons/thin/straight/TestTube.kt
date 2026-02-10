package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TestTube: ImageVector? = null

val Icons.Ts.TestTube: ImageVector
    get() = _TestTube ?: UXIcon(name = "TestTube") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                lineTo(5f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                lineTo(17f, 1f)
                horizontalLineToRelative(2f)
                lineTo(19f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                lineTo(8f, 7f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
                moveTo(16f, 6f)
                horizontalLineToRelative(-8f)
                lineTo(8f, 1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _TestTube = it}
