package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LegalFees: ImageVector? = null

val Icons.Bs.LegalFees: ImageVector
    get() = _LegalFees ?: UXIcon(name = "LegalFees") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 21f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-16f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(3f)
                close()
                moveTo(4.5f, 19f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-0.76f)
                lineToRelative(3.44f, -8.74f)
                horizontalLineToRelative(2.06f)
                lineToRelative(3.5f, 8.74f)
                verticalLineToRelative(0.76f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(3.09f, 14f)
                horizontalLineToRelative(2.82f)
                lineToRelative(-1.41f, -3.99f)
                close()
                moveTo(24f, 13.74f)
                verticalLineToRelative(0.76f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-0.76f)
                lineToRelative(3.5f, -8.74f)
                horizontalLineToRelative(2.06f)
                close()
                moveTo(20.91f, 14f)
                lineTo(19.5f, 10.01f)
                lineTo(18.09f, 14f)
                close()
                moveTo(13f, 9f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.36f, -0.97f, -2.51f, -2.31f, -2.73f)
                lineToRelative(-3.04f, -0.51f)
                curveToRelative(-0.37f, -0.06f, -0.64f, -0.38f, -0.64f, -0.76f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 1.36f, 0.97f, 2.51f, 2.31f, 2.73f)
                lineToRelative(3.04f, 0.51f)
                curveToRelative(0.37f, 0.06f, 0.64f, 0.38f, 0.64f, 0.76f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _LegalFees = it}
