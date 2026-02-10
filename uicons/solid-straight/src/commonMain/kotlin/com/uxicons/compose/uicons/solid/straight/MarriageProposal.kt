package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarriageProposal: ImageVector? = null

val Icons.Ss.MarriageProposal: ImageVector
    get() = _MarriageProposal ?: UXIcon(name = "MarriageProposal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 6.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(24f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-4.28f)
                lineToRelative(-4.33f, -2.4f)
                lineToRelative(1.11f, 9.4f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(5f)
                lineTo(3f, 24f)
                verticalLineToRelative(-5f)
                lineTo(0.07f, 19f)
                lineTo(1.24f, 8.93f)
                curveToRelative(0.18f, -1.66f, 1.58f, -2.92f, 3.26f, -2.93f)
                verticalLineToRelative(-0.0f)
                reflectiveCurveToRelative(0.01f, 0f, 0.01f, 0f)
                curveToRelative(0.0f, 0f, 0.01f, 0f, 0.01f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(1.27f, 0.01f, 2.39f, 0.69f, 3.35f, 1.32f)
                lineToRelative(4.41f, 2.68f)
                horizontalLineToRelative(6.22f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(3f)
                close()
                moveTo(4.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(5.88f, 0f, 4.5f, 0f)
                reflectiveCurveTo(2f, 1.12f, 2f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }.also { _MarriageProposal = it}
