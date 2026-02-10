package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarriageProposal: ImageVector? = null

val Icons.Bs.MarriageProposal: ImageVector
    get() = _MarriageProposal ?: UXIcon(name = "MarriageProposal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 6.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(24f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-4.05f)
                curveToRelative(-0.17f, 0.02f, -0.33f, 0.05f, -0.5f, 0.05f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4.42f)
                lineToRelative(-3.61f, -2.17f)
                lineToRelative(0.68f, 7.17f)
                horizontalLineToRelative(-2.65f)
                verticalLineToRelative(6f)
                lineTo(3f, 24f)
                verticalLineToRelative(-6f)
                lineTo(-0.0f, 18f)
                lineTo(0.98f, 9.12f)
                curveToRelative(0.2f, -1.78f, 1.69f, -3.12f, 3.48f, -3.12f)
                curveToRelative(1.42f, 0f, 2.62f, 0.73f, 3.64f, 1.41f)
                lineToRelative(4.32f, 2.59f)
                horizontalLineToRelative(5.58f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3f)
                close()
                moveTo(3.35f, 15f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-0.56f, -5.96f)
                curveToRelative(-0.4f, -0.1f, -0.79f, 0.04f, -0.83f, 0.4f)
                lineToRelative(-0.61f, 5.55f)
                close()
                moveTo(4.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(5.88f, 0f, 4.5f, 0f)
                reflectiveCurveTo(2f, 1.12f, 2f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }.also { _MarriageProposal = it}
