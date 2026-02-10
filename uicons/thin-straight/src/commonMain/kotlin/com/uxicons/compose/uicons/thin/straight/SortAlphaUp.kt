package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAlphaUp: ImageVector? = null

val Icons.Ts.SortAlphaUp: ImageVector
    get() = _SortAlphaUp ?: UXIcon(name = "SortAlphaUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 15f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1.16f)
                lineToRelative(-4.89f, 6.84f)
                horizontalLineToRelative(4.89f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-1.16f)
                lineToRelative(4.89f, -6.84f)
                horizontalLineToRelative(-4.89f)
                verticalLineToRelative(-1f)
                close()
                moveTo(22f, 3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1f)
                lineTo(21f, 6f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                lineTo(16f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
                moveTo(21f, 5f)
                lineTo(21f, 3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(7f, 1.27f)
                lineTo(7f, 24f)
                horizontalLineToRelative(-1f)
                lineTo(6f, 1.27f)
                lineTo(1.38f, 5.88f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(5.39f, 0.46f)
                curveToRelative(0.29f, -0.3f, 0.69f, -0.46f, 1.11f, -0.46f)
                reflectiveCurveToRelative(0.81f, 0.16f, 1.11f, 0.46f)
                lineToRelative(4.72f, 4.72f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(7f, 1.27f)
                close()
            }
        }.also { _SortAlphaUp = it}
