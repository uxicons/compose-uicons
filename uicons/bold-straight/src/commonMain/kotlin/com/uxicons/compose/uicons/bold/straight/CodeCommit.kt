package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeCommit: ImageVector? = null

val Icons.Bs.CodeCommit: ImageVector
    get() = _CodeCommit ?: UXIcon(name = "CodeCommit") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10.5f)
                horizontalLineToRelative(-5.16f)
                curveToRelative(-0.69f, -3.14f, -3.49f, -5.5f, -6.84f, -5.5f)
                reflectiveCurveToRelative(-6.15f, 2.36f, -6.84f, 5.5f)
                lineTo(0f, 10.5f)
                verticalLineToRelative(3f)
                lineTo(5.16f, 13.5f)
                curveToRelative(0.69f, 3.14f, 3.49f, 5.5f, 6.84f, 5.5f)
                reflectiveCurveToRelative(6.15f, -2.36f, 6.84f, -5.5f)
                horizontalLineToRelative(5.16f)
                verticalLineToRelative(-3f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
            }
        }.also { _CodeCommit = it}
