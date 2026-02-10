package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DegreeCredential: ImageVector? = null

val Icons.Ss.DegreeCredential: ImageVector
    get() = _DegreeCredential ?: UXIcon(name = "DegreeCredential") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 2f)
                lineTo(3f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(-2.03f)
                curveToRelative(-0.74f, -0.84f, -1.22f, -1.86f, -1.41f, -2.97f)
                horizontalLineToRelative(-5.09f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.09f)
                reflectiveCurveToRelative(0f, 0.0f, 0f, 0.01f)
                curveToRelative(0.12f, -0.74f, 0.38f, -1.38f, 0.75f, -2.01f)
                curveToRelative(-0.01f, 0.02f, -5.84f, 0f, -5.84f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7.69f)
                curveToRelative(-0.01f, 0.0f, -0.01f, 0.01f, -0.02f, 0.01f)
                curveToRelative(0.95f, -0.64f, 2.1f, -1.01f, 3.33f, -1.01f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 1.48f, -0.54f, 2.88f, -1.5f, 3.97f)
                verticalLineToRelative(2.03f)
                horizontalLineToRelative(3.5f)
                lineTo(24.0f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(19f, 9f)
                lineTo(5f, 9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                close()
                moveTo(13.5f, 24f)
                verticalLineToRelative(-4.88f)
                curveToRelative(-0.91f, -0.73f, -1.5f, -1.86f, -1.5f, -3.12f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                curveToRelative(0f, 1.26f, -0.59f, 2.39f, -1.5f, 3.12f)
                verticalLineToRelative(4.88f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(-2.5f, 2.5f)
                close()
            }
        }.also { _DegreeCredential = it}
