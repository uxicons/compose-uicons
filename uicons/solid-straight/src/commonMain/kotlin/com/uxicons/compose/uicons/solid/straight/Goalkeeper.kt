package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Goalkeeper: ImageVector? = null

val Icons.Ss.Goalkeeper: ImageVector
    get() = _Goalkeeper ?: UXIcon(name = "Goalkeeper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.66f, 12.24f)
                lineToRelative(-3.8f, -5.97f)
                lineToRelative(2.39f, -1.27f)
                horizontalLineToRelative(4.75f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5.25f)
                lineToRelative(-6.54f, 3.49f)
                curveToRelative(-0.93f, 0.49f, -1.71f, 1.23f, -2.27f, 2.12f)
                lineToRelative(-1.49f, 2.39f)
                horizontalLineToRelative(-3.44f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.55f)
                lineToRelative(2.08f, -3.33f)
                curveToRelative(0.01f, -0.01f, 0.01f, -0.02f, 0.02f, -0.03f)
                lineToRelative(6.34f, 10.15f)
                verticalLineToRelative(4.21f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.79f)
                lineToRelative(-2.31f, -3.69f)
                lineToRelative(2.17f, -1.38f)
                lineToRelative(3.15f, 2.36f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6.5f)
                lineToRelative(-4.34f, -3.26f)
                close()
                moveTo(7.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(4f, 9f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _Goalkeeper = it}
