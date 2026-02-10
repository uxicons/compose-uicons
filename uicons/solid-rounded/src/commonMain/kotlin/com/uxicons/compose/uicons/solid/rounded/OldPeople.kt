package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OldPeople: ImageVector? = null

val Icons.Sr.OldPeople: ImageVector
    get() = _OldPeople ?: UXIcon(name = "OldPeople") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(20f, 14f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(18f, 14.6f)
                curveToRelative(-1.37f, -0.78f, -2.82f, -1.94f, -4.02f, -3.2f)
                curveToRelative(-0.06f, 1.36f, -0.04f, 3.03f, -0.01f, 4.88f)
                lineToRelative(0.02f, 1.68f)
                curveToRelative(0.03f, 1.25f, -0.81f, 2.45f, -1.99f, 2.85f)
                verticalLineToRelative(2.19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.19f)
                curveToRelative(-1.21f, -0.41f, -2.05f, -1.66f, -1.98f, -2.94f)
                curveToRelative(0.31f, -7.65f, 2.61f, -11.87f, 6.48f, -11.87f)
                curveToRelative(1.73f, -0.11f, 2.96f, 1.41f, 3.81f, 2.71f)
                curveToRelative(1.26f, 1.71f, 3.38f, 3.52f, 5.14f, 4.4f)
                curveToRelative(0.34f, 0.17f, 0.55f, 0.52f, 0.55f, 0.9f)
                close()
            }
        }.also { _OldPeople = it}
