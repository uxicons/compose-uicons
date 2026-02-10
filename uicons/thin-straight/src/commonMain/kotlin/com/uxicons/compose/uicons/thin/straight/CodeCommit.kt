package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeCommit: ImageVector? = null

val Icons.Ts.CodeCommit: ImageVector
    get() = _CodeCommit ?: UXIcon(name = "CodeCommit") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.5f)
                horizontalLineToRelative(-5.02f)
                curveToRelative(-0.26f, -3.63f, -3.29f, -6.5f, -6.98f, -6.5f)
                reflectiveCurveToRelative(-6.72f, 2.87f, -6.98f, 6.5f)
                lineTo(0f, 11.5f)
                verticalLineToRelative(1f)
                lineTo(5.02f, 12.5f)
                curveToRelative(0.26f, 3.63f, 3.29f, 6.5f, 6.98f, 6.5f)
                reflectiveCurveToRelative(6.72f, -2.87f, 6.98f, -6.5f)
                horizontalLineToRelative(5.02f)
                verticalLineToRelative(-1f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
            }
        }.also { _CodeCommit = it}
