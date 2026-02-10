package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ballot: ImageVector? = null

val Icons.Rs.Ballot: ImageVector
    get() = _Ballot ?: UXIcon(name = "Ballot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveTo(2f, 1.35f, 3.35f, 0f, 5f, 0f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                lineTo(22f, 24f)
                close()
                moveTo(4f, 22f)
                lineTo(20f, 22f)
                lineTo(20f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(5f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(4f, 22f)
                close()
                moveTo(18f, 5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18f, 11f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18f, 17f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                close()
                moveTo(10f, 4f)
                lineTo(6f, 4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                lineTo(10f, 4f)
                close()
                moveTo(10f, 10f)
                lineTo(6f, 10f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                close()
                moveTo(10f, 16f)
                lineTo(6f, 16f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _Ballot = it}
