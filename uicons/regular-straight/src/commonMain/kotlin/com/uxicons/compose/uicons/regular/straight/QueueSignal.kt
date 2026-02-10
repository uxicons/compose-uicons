package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _QueueSignal: ImageVector? = null

val Icons.Rs.QueueSignal: ImageVector
    get() = _QueueSignal ?: UXIcon(name = "QueueSignal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(14f, 9f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                lineTo(0f, 17f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(0.03f)
                curveToRelative(-0.64f, 0.84f, -1.03f, 1.87f, -1.03f, 3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(12f, 9f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                close()
                moveTo(5f, 5f)
                curveToRelative(0.09f, 0f, 0.17f, -0.02f, 0.25f, -0.03f)
                curveToRelative(-0.47f, -0.71f, -0.75f, -1.56f, -0.75f, -2.48f)
                reflectiveCurveTo(4.78f, 0.74f, 5.25f, 0.03f)
                curveToRelative(-0.08f, -0.01f, -0.16f, -0.03f, -0.25f, -0.03f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(21f, 10f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(-3f)
                lineTo(16f, 0f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(18f, 8f)
                horizontalLineToRelative(4f)
                lineTo(22f, 2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _QueueSignal = it}
