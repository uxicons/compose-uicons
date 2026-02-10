package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Thursday: ImageVector? = null

val Icons.Ss.Thursday: ImageVector
    get() = _Thursday ?: UXIcon(name = "Thursday") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 17.6f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(6.4f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-6.4f)
                horizontalLineToRelative(-1.65f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1.6f)
                close()
                moveTo(16.9f, 16f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(-1.41f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-3.15f)
                horizontalLineToRelative(1.41f)
                verticalLineToRelative(3.15f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-1.6f)
                close()
                moveTo(22.4f, 16f)
                verticalLineToRelative(5.73f)
                curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                reflectiveCurveToRelative(-0.7f, -0.31f, -0.7f, -0.7f)
                verticalLineToRelative(-5.73f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(5.73f)
                curveToRelative(0f, 1.27f, 1.03f, 2.3f, 2.3f, 2.3f)
                reflectiveCurveToRelative(2.3f, -1.03f, 2.3f, -2.3f)
                verticalLineToRelative(-5.73f)
                horizontalLineToRelative(-1.6f)
                close()
                moveTo(0f, 8f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                lineTo(6f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                lineTo(16f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(3f)
                lineTo(0f, 8f)
                close()
                moveTo(0f, 10f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(7.65f)
                verticalLineToRelative(-4.43f)
                horizontalLineToRelative(-1.65f)
                verticalLineToRelative(-5.57f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-4f)
                lineTo(0f, 10f)
                close()
            }
        }.also { _Thursday = it}
