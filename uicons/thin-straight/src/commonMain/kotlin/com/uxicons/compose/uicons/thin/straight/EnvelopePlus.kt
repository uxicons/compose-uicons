package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopePlus: ImageVector? = null

val Icons.Ts.EnvelopePlus: ImageVector
    get() = _EnvelopePlus ?: UXIcon(name = "EnvelopePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                lineTo(19f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 6.88f)
                lineToRelative(7.8f, 7.8f)
                curveToRelative(0.88f, 0.88f, 2.03f, 1.32f, 3.18f, 1.32f)
                reflectiveCurveToRelative(2.3f, -0.44f, 3.18f, -1.32f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                lineToRelative(3.52f, -3.68f)
                horizontalLineToRelative(-1.39f)
                lineToRelative(-2.84f, 2.98f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(-1.36f, 1.36f, -3.58f, 1.36f, -4.95f, 0f)
                lineTo(1.23f, 5.7f)
                curveToRelative(0.27f, -0.42f, 0.73f, -0.7f, 1.27f, -0.7f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(-1f)
                lineTo(2.5f, 4f)
                curveTo(1.12f, 4f, 0f, 5.12f, 0f, 6.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(16f)
                close()
            }
        }.also { _EnvelopePlus = it}
