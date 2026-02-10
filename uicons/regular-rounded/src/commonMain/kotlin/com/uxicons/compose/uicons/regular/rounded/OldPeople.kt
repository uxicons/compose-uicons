package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OldPeople: ImageVector? = null

val Icons.Rr.OldPeople: ImageVector
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
                curveToRelative(0.01f, 0.81f, -0.3f, 1.57f, -0.87f, 2.15f)
                curveToRelative(-0.32f, 0.32f, -0.7f, 0.56f, -1.12f, 0.7f)
                verticalLineToRelative(2.19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.19f)
                curveToRelative(-0.43f, -0.15f, -0.82f, -0.39f, -1.14f, -0.73f)
                curveToRelative(-0.57f, -0.6f, -0.87f, -1.38f, -0.84f, -2.21f)
                curveToRelative(0.31f, -7.65f, 2.61f, -11.87f, 6.48f, -11.87f)
                curveToRelative(1.73f, -0.11f, 2.96f, 1.41f, 3.81f, 2.71f)
                curveToRelative(1.26f, 1.71f, 3.38f, 3.52f, 5.14f, 4.4f)
                curveToRelative(0.34f, 0.17f, 0.55f, 0.52f, 0.55f, 0.9f)
                close()
                moveTo(11.69f, 8.54f)
                curveToRelative(-0.3f, -0.35f, -0.73f, -0.54f, -1.19f, -0.54f)
                curveToRelative(-3.79f, 0f, -4.39f, 7.62f, -4.48f, 9.95f)
                curveToRelative(-0.03f, 0.56f, 0.44f, 1.06f, 1f, 1.05f)
                horizontalLineToRelative(3.97f)
                curveToRelative(0.54f, 0.01f, 1.02f, -0.48f, 1f, -1.02f)
                lineToRelative(-0.02f, -1.68f)
                curveToRelative(-0.04f, -2.67f, -0.07f, -4.79f, 0.13f, -6.45f)
                curveToRelative(0.06f, -0.48f, -0.09f, -0.97f, -0.41f, -1.32f)
                close()
            }
        }.also { _OldPeople = it}
