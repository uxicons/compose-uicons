package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Synagogue: ImageVector? = null

val Icons.Ss.Synagogue: ImageVector
    get() = _Synagogue ?: UXIcon(name = "Synagogue") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 3.78f)
                lineTo(12f, 0.03f)
                lineToRelative(-5f, 3.75f)
                verticalLineToRelative(20.22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                lineTo(17f, 3.78f)
                close()
                moveTo(15f, 11.73f)
                horizontalLineToRelative(-2.1f)
                lineToRelative(-0.9f, 1.5f)
                lineToRelative(-0.9f, -1.5f)
                horizontalLineToRelative(-2.1f)
                lineToRelative(1.05f, -1.75f)
                lineToRelative(-1.05f, -1.75f)
                horizontalLineToRelative(2.1f)
                lineToRelative(0.9f, -1.5f)
                lineToRelative(0.9f, 1.5f)
                horizontalLineToRelative(2.1f)
                lineToRelative(-1.05f, 1.75f)
                lineToRelative(1.05f, 1.75f)
                close()
                moveTo(13f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(24f, 11.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-12.5f)
                lineToRelative(2.5f, -2f)
                lineToRelative(2.5f, 2f)
                close()
                moveTo(5f, 11.5f)
                verticalLineToRelative(12.5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-12.5f)
                lineToRelative(2.5f, -2f)
                lineToRelative(2.5f, 2f)
                close()
            }
        }.also { _Synagogue = it}
