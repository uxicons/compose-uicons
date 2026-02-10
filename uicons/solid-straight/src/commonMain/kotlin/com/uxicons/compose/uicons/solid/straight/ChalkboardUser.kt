package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChalkboardUser: ImageVector? = null

val Icons.Ss.ChalkboardUser: ImageVector
    get() = _ChalkboardUser ?: UXIcon(name = "ChalkboardUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 19f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(7f, 14f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-8.1f)
                curveToRelative(-0.44f, -2.14f, -2.25f, -3.76f, -4.47f, -3.96f)
                curveToRelative(0.97f, -1.07f, 1.57f, -2.49f, 1.57f, -4.04f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                curveToRelative(-0.7f, 0f, -1.37f, 0.12f, -2f, 0.34f)
                verticalLineToRelative(-1.34f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(13f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(22f, 14f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _ChalkboardUser = it}
